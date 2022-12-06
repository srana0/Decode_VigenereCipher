
# Decrypt a Vigenere Cipher for a given key length and ciphertext usng English Language Frequency Analysis.


Algorithm: Let m be a positive integer. The plaintext, ciphertext, and the key
space is {0, 1, 2, · · · , 25}.

Key k = (k<sub>1</sub>, k<sub>2</sub>, · · · , k<sub>m</sub>) 
Plaintext x = (x<sub>1</sub>, x<sub>2</sub>, · · · , x<sub>m</sub>), 

The encryption function is defined as
y = E<sub>k</sub>(x) = (x<sub>1</sub> + k<sub>1</sub> mod 26, x<sub>2</sub> + k<sub>2</sub> mod 26, · · · , x<sub>m</sub> + k<sub>m</sub> mod 26),
and the corresponding decryption function is defined as
E<sub>k</sub>(y) = (y<sub>1</sub> − k<sub>1</sub> mod 26, y<sub>2</sub> − k<sub>2</sub> mod 26, · · · , y<sub>m</sub> − k<sub>m</sub> mod 26).

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
