
# Decrypt a Vigenere Cipher for a given key length and ciphertext using English Language Frequency Analysis.

Consider the vigenere cipher: Let m be a positive integer. The plaintext, ciphertext, and the key space is {0, 1, 2, · · · , 25}. 

For a key k = (k1, k2, · · · , km) and a plaintext x = (x1, x2, · · · , xm), the encryption function is defined as
y = Ek(x) = (x1 + k1 mod 26, x2 + k2 mod 26, · · · , xm + km mod 26), and the corresponding decryption function is defined as
Ek(y) = (y1 − k1 mod 26, y2 − k2 mod 26, · · · , ym − km mod 26).

Note that you need to convert the text into numerical equivalent numbers for both encryption and decryption. The following ciphertext is produced by the vigen`ere cipher with a key of length m = 5. 

Please recover the plaintext message and the key from the ciphertext. You may need to write a code for this task.

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



Algorithm: Let m be a positive integer. The plaintext, ciphertext, and the key
space is {0, 1, 2, · · · , 25}.

Key k = (k<sub>1</sub>, k<sub>2</sub>, · · · , k<sub>m</sub>) 
<br />
Plaintext x = (x<sub>1</sub>, x<sub>2</sub>, · · · , x<sub>m</sub>), 
<br />
The encryption function is defined as
y = E<sub>k</sub>(x) = (x<sub>1</sub> + k<sub>1</sub> mod 26, x<sub>2</sub> + k<sub>2</sub> mod 26, · · · , x<sub>m</sub> + k<sub>m</sub> mod 26),
<br />
<br />
The corresponding decryption function is defined as
E<sub>k</sub>(y) = (y<sub>1</sub> − k<sub>1</sub> mod 26, y<sub>2</sub> − k<sub>2</sub> mod 26, · · · , y<sub>m</sub> − k<sub>m</sub> mod 26).
<br />
<br />
Note:  You need to convert the text into numerical equivalent numbers for both encryption and
decryption. 
<br />
<br />
The following ciphertext is produced by the vigen`ere cipher with a key of length m = 5. 
Please recover the plaintext message and the key from the ciphertext.
<br />
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
