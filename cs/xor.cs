var key = 11;
var val = 'A';
var xor = val ^ key;
Console.WriteLine( (char)(xor) );
Console.WriteLine( (char)(xor ^ key) );

var source = "Kunde Bosch, Stuttgart, KNR: 448845";
var encrypted = "";

for (var i = 0; i < source.Length; i++)
{
    encrypted = encrypted + (char)(source[i] ^ key);
}

Console.WriteLine( encrypted );
