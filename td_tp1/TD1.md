# TD 1

## Exo 1

Le programme affiche
```
nb1 = 10
nb2 = 20
e1.a = 20
e2.a = 10
```

## Exo 2

Le programme affiche l'adresse de l'objet `etudiante`.

## Exo 3

Le programme affiche 
```
e2:5
e3:7
e3:8
```

## Exo 4
`float b = 3.5f`
`double c = 6.7;`

## Exo 5
### Part 1
avant r1 :
- a = 6
- b = 6
- r1 = ?
- r2 = ?

après r1 :
- a = 7
- b = 6
- r1 = 14
- r2 = ?

après r2 : 
- a = 7
- b = 7
- r1 = 14
- r2 = 12

### Part 2
- i = 2, j = 14
- i = 15, j = 15
- i = 15, j = 16
- i = 17, j = 22
- i = 18, j = 22

### Part 3
il faut remplacer par `i = (int) (j/e + k/f)`
ou `i = j/(int)e + k/(int)f`
et `i = (int) (f/e + k/j)`
et `car = (char) car + 1`
- i = 1
- i = 2
- i = 3
- i = 4
- i = 2
- car = une autre lettre, probablement B


## Exo 6

```
int p;
int n= p+10;
p=5;
```
ne compile pas, p n'est pas initialisé

```
int p;
if (....){
p=20;
}
n=p*2;
```
ne compile pas : p n'est pas initialisé dans tout les cas de figures

```
int p;
if (....){
p=20;
}
else{
p=30;
}
n=p*2;
```
Dans tout les cas de figures, p compile


## Exo 7

