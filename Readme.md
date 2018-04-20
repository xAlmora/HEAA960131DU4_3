# Por que funciona
Cuando duplicamos la cadena esta sigue con el patrón solo que con otro tamaño.
Esto es [0,n-1] -> [0,2n-1]
cuando hacemos ese mapeo nos interesa checar si
[1,2n-1) que es lo mismo que [1,2n-2] contiene nuestra cadena inicial
es decir, nuestra cadena inicial existe adentro sin los extremos de la cadena duplicada.
Lo que nos dice que el patron se cumple porque los extremos estan en la repeticion y continuan en la suma de las dos string.
