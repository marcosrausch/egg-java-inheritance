# egg-java-herencia

## Ejercicios

### 1. Animales
> Tenemos una clase padre Animal junto con sus 3 clases hijas: Perro, Gato, Caballo.  
La clase Animal tendr� como atributos el _nombre_, _alimento_, _edad_ y _raza_ del Animal.  
Crear un m�todo en la clase Animal a trav�s del cual cada clase hija deber� mostrar  
luego un mensaje por pantalla informando de qu� se alimenta.

![animals](./animals.png) 

---

### 2. Electrodom�sticos
> Crear una superclase llamada Electrodom�stico con los siguientes atributos:  
_precio_, _color_, _consumo energ�tico_ (letras entre A y F) y _peso_.  

Los **constructores** que se deben implementar son los siguientes:  
� Un constructor vac�o.  
� Un constructor con todos los atributos pasados por par�metro.  

Los **m�todos** a implementar son:  
� M�todos getters y setters de todos los atributos.  

� M�todo `comprobarConsumoEnergetico(char letra)`: comprueba que la letra es correcta,  
si no lo es, usar� la letra F por defecto. Este m�todo se debe invocar al crear el objeto y no ser� visible.  

� M�todo `comprobarColor(String color)`: comprueba que el color es correcto, y si no lo es,
usar� el color blanco por defecto.  
Los colores disponibles para los electrodom�sticos son
_blanco_, _negro_, _rojo_, _azul_ y _gris_.  
No importa si el nombre est� en may�sculas o en
min�sculas. Este m�todo se invocar� al crear el objeto y no ser� visible.  

� Metodo `crearElectrodomestico()`: le pide la informaci�n al usuario y llena el
electrodom�stico,  
tambi�n llama los m�todos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.  

� M�todo `precioFinal()`: seg�n el consumo energ�tico y su tama�o, aumentar� el valor del
precio. Esta es la lista de precios:

![costs](./costs.png) 
<br><br>

> A continuaci�n, se debe crear una subclase llamada Lavadora, con el atributo _carga_,
adem�s de los atributos heredados.  

Los **constructores** que se implementar�n ser�n:  
� Un constructor vac�o.  
� Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes llamar al constructor de la clase padre.  

Los **m�todos** que se implementara ser�n:  
� M�todo get y set del atributo carga.  

� M�todo `crearLavadora()`: este m�todo llama a `crearElectrodomestico()` de la clase
padre,  
lo utilizamos para llenar los atributos heredados del padre y despu�s llenamos
el atributo propio de la lavadora.  

� M�todo `precioFinal()`. Este m�todo ser� heredado y se le sumar� la siguiente
funcionalidad:  
- si tiene una carga mayor de 30 Kg., aumentar� el precio en $500;  
- si la carga es menor o igual, no se incrementar� el precio.  
Este m�todo debe llamar al
m�todo padre y a�adir el c�digo necesario.  
Recuerda que las condiciones que hemos
visto en la clase Electrodom�stico tambi�n deben afectar al precio.  
<br><br>

> Se debe crear tambi�n una subclase llamada Televisor con los siguientes atributos:  
_resoluci�n_ (en pulgadas) y _sintonizador TDT_ (booleano), adem�s de los atributos
heredados.  

Los **constructores** que se implementar�n ser�n:  
� Un constructor vac�o.    
� Un constructor con la resoluci�n, sintonizador TDT y el resto de los atributos
heredados.  
Recuerda que debes llamar al constructor de la clase padre.


Los **m�todos** que se implementara ser�n:  
� M�todo get y set de los atributos resoluci�n y sintonizador TDT.

� M�todo `crearTelevisor()`: este m�todo llama a `crearElectrodomestico()` de la clase
padre,  
lo utilizamos para llenar los atributos heredados del padre y despu�s llenamos los atributos del televisor.  

� M�todo `precioFinal()`. este m�todo ser� heredado y se le sumar� la siguiente
funcionalidad:  
- si el televisor tiene una resoluci�n mayor de 40 pulgadas, se
incrementar� el precio un 30%;  
- si tiene un sintonizador TDT incorporado, aumentar� $500.  
Recuerda que las condiciones que hemos visto en la clase Electrodomestico
tambi�n deben afectar al precio.  
<br>
> Finalmente, en el `main` vamos a crear una Lavadora y un Televisor y  
llamar a los m�todos necesarios para mostrar el precio final de los dos electrodom�sticos.

---

### 3. Electrodom�sticos

> Siguiendo el ejercicio anterior, en el `main` vamos a: 

- crear un ArrayList de Electrodom�sticos  
para guardar 4 electrodom�sticos, ya sean lavadoras o televisores, con valores ya asignados.  
- Luego, recorrer este array y ejecutar el m�todo `precioFinal()` en cada electrodom�stico.  
- Se deber� tambi�n mostrar el precio de cada tipo de objeto, es decir, el precio de todos los  
televisores y el de las lavadoras.  
- Una vez hecho eso, tambi�n deberemos mostrar la suma del precio de todos los Electrodom�sticos.  
Por ejemplo, si tenemos una lavadora con un precio de 2000 y un televisor de 5000,  
el resultado final ser� de 7000 para electrodom�sticos, 2000 para lavadora y 5000 para televisor.

---

### 4. Formas geom�tricas

> Se plantea desarrollar un programa que nos permita calcular el �rea y el per�metro de formas  
geom�tricas. En este caso, un c�rculo y un rect�ngulo. Ya que este c�lculo se va a repetir en las  
dos formas geom�tricas, vamos a crear una **Interfaz**, llamada `calculosFormas` que tendr� los  
dos m�todos para calcular el �rea, el per�metro y el valor de PI como constante.  

Desarrollar el ejercicio para que las formas implementen los m�todos de la interfaz y se  
calcule el �rea y el per�metro de los dos. En el main se crear�n las formas y se mostrar� el  
resultado final.  
�rea circulo: PI * radio ^ 2 / Per�metro circulo: PI * di�metro.  
�rea rect�ngulo: base * altura / Per�metro rect�ngulo: (base + altura) * 2.