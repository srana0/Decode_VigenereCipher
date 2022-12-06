# Decode_VigenereCipher

Decrypt a Vigenere Cipher for a given key length and ciphertext usng English Language Frequency Analysis.


Algorithm: Let m be a positive integer. The plaintext, ciphertext, and the key
space is {0, 1, 2, · · · , 25}.

For a key k = (k1, k2, · · · , km) and a plaintext x = (x1, x2, · · · , xm), 
the encryption function is defined as
y = Ek(x) = (x1 + k1 mod 26, x2 + k2 mod 26, · · · , xm + km mod 26),
and the corresponding decryption function is defined as
Ek(y) = (y1 − k1 mod 26, y2 − k2 mod 26, · · · , ym − km mod 26).

Note:  You need to convert the text into numerical equivalent numbers for both encryption and
decryption. 

The following ciphertext is produced by the vigen`ere cipher with a key of length m = 5. 
Please recover the plaintext message and the key from the ciphertext.

Ciphertext:
QAVHYFOVEDFMPBQKXNOCRGJJTZDZFDFMLNEBWFAEEXKELABKVZKTCGPOKZGZORFSEEXNBWXLKBBBRGRZMEV
GSBKZIPOMYNECEFJDYXJVOBMYRFKBMRCPBKLTPPFYLPMFDLIHETHEBTUWFOVGSBPFYLPMFDTVBBJZITJGZN
KVALJXUFEGHYACFOVEMVXREWVVFYZKBRYLRMYBCFMZRDTTJNGFMRYAXKKBQIBWRQLKKUPTHCNDQHHVJFDGE
ZSBUVYDYFBOXGUZPABTVYBTEQNLGERNQBETEEXNBWXLKBBBRMVWITXRDXEFARPBURTQMYRWXGUSPAUPGSBK
ZIPOPRFFPXUSZOALAEFGXULOOVFEFGXZPABTVYBLRAOLUKNTKBETMRBCQTKZDNEBKZNWPWRVWVEZSPXGUPF
IMLEPTXIRCFVYNYAORETBWTRCBFFATBLNRCBIVEQLKDROXGUXYLPCRODXNNDMTJFPAWFJYQAIBFDAXRYBKR
GTLGJGSBNEVGBKJVEVHWAPTUIHYPPZPVFLKUPCBIFEBGXYTPACNYDNRTPRGZIPOLZGJFGTNYXWROFQMYRQF
KJGWXGXHLDXJCZHXEBYQAZFWXGUVDTHCNDQHHRJITKHHBPRXZKMYRQFKJGEBTTUTKZJBYQAVYLKWNRCBMYR
EBTTUTKZJBQQAVJZITJGZNBPVVX
