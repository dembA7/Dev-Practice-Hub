// Unir arreglos
const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];
const arregloCombinado = [...arr1, ...arr2]; // [1, 2, 3, 4, 5, 6]

// Copiar un arreglo
const copiaArreglo = [...arr1];

// Pasar elementos de un arreglo como argumentos a una función
function sumar(a, b, c) {
  return a + b + c;
}
const numeros = [1, 2, 3];
const resultado = sumar(...numeros); // Resultado: 6

/*

El operador spread se utiliza para descomponer un arreglo o un 
objeto en sus elementos individuales. Se representa también con 
tres puntos (...). Puede utilizarse en arreglos y objetos literales, 
así como en llamadas a funciones.

*/
