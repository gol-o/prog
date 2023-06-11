#include <iostream>
#include <chrono>
#include <cstdint>
#include <vector>
#include <algorithm>
#include <sstream>
#include <random>
#include <string>

using namespace std;

unsigned int randomChar( )
{
    std::random_device              rd;
    std::mt19937                    gen( rd( ) );
    std::uniform_int_distribution<> dis( 0, 255 );

    return dis( gen );
}

std::string guid( const unsigned int len )
{
    std::stringstream ss;

    for (auto i = 0; i < len; i++)
    {
        const auto        rc = randomChar( );
        std::stringstream hexstream;

        hexstream << std::hex << rc;
        auto hex = hexstream.str( );
        ss << (hex.length( ) < 2 ? '0' + hex : hex ) << ( !( i % 3) ? "-" : "");
    }

    return ss.str( );
}

struct Person
{
    enum Country { DE, US, CH, JP, IT, FR, GB } country;

    string                passportId;
    uint8_t               age;
    char                  sex;
    static vector<Person> persons;
    static vector<Person> v;

    Person( ) : passportId( guid( 20 )),
                country( Country( rand( ) % 7 ) ),
                age(rand( ) % 80 + 18),
                sex(rand( ) % 2 ? 'f' : 'm')
    {
    }

    void get( )
    {
        switch (country)
        {
            case DE  :  puts( "de" ); break;
            case US  :  puts( "us" ); break;
            case JP  :  puts( "jp" ); break;
            case FR  :  puts( "fr" ); break;
            case GB  :  puts( "gb" ); break;
            case IT  :  puts( "it" ); break;
            case CH  :  puts( "ch" );
        }

        cout << (int)age << ", " << sex << ", " << passportId << endl;
    }

    void static fillPersonDb( unsigned numRecords )
    {
        for( size_t i = 0; i < numRecords; i++ ) 
        {
            persons.push_back( Person( ) );
        }
    }

    static void dump( )
    {
        for( auto p : persons )
        {
            p.get( );
        }
    }

    static void dump( uint8_t ageFrom, uint8_t ageTo )
    {
        v.clear( );
        for( auto p : persons )
            if( p.age >= ageFrom && p.age <= ageTo )
                v.push_back( p );

        sort( v.begin( ), v.end( ), comparer );
        sort( v.begin( ), v.end( ), [ ]( auto &p, auto &q ) -> bool { return p.age < q.age; } );
        sort( v.begin( ), v.end( ), [ ]( auto &p, auto &q ) -> bool { return p.age > q.age; } );

        for( auto p : v )
            if( p.age >= ageFrom && p.age <= ageTo )
                p.get( );
    }

    static bool comparer( Person p, Person q )
    {
        return p.age > q.age;
    }
};

vector<Person> Person::persons;
vector<Person> Person::v;

int main( )
{
    Person::fillPersonDb( 100 );
    Person::dump( );
    Person::dump( 30, 45 );
    cin.get( );
}
