//================================================================================
// Copy elision
// Omits copy and move constructors, resulting in zero-copy pass-by-value semantics.
// Mandatory elision of copy/move operations. The objects are constructed directly
// into the storage where they would otherwise be copied/moved to.
// The copy/move constructors need not be present or accessible.
//================================================================================

#include <iostream>
using namespace std;

struct A
{
    int i = 1;

    A( const A & )        { cout << __FUNCSIG__ << endl; }
    A( )                  { cout << __FUNCSIG__ << endl; }
    A( A && )             { cout << __FUNCSIG__ << endl; }
    A( int &&i ) : i( i ) { cout << __FUNCSIG__ << endl; }
    ~A( )                 { cout << __FUNCSIG__ << endl; }
 
    void operator=( const A & ) { cout << __FUNCSIG__ << endl; }
};

A f( ) { return A( ); }

int main( )
{
    {
        A a = f( );
        getchar( );
    }

    {
        // declare variable and do initialize
        A a = A( ); // ctor (not mctor)
        // dtor
    }
    getchar( );

    {
        A a;      // ctor
        A b = a;  // cctor
        A c( a ); // cctor
        // dtor x 3
    }
    getchar( );

    {
        A *a = new A; // ctor
        // no dtor call
        a->~A( ); // need to call explicitly

    }
    getchar( );

    {
        // object intialization with temporary object declared/returned by lambda expression
        A a = [ ]( ) -> A { return A( ); }( ); // ctor
        // dtor
    }
    getchar( );

    {
        // object intialization with temporary object declared/returned by lambda expression
        A a = [ ]( ) -> A { A a; return a; }( ); // ctor, mctor
        // dtor
        // dtor
    }
    getchar( );

    {
        A a = 2; // mctor (every constructor call creates an object)
        cout << a.i << endl;
        // dtor 
    }
    getchar( );

    {
        A a = std::move( A( 2 ) ); // ctor creates temporary, mctor creates different object
        cout << a.i << endl; // still 1
        // dtor x 2
    }
    getchar( );
}
