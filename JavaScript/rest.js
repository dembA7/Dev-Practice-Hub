function sumar(...numeros) {
    return numeros.reduce((total, numero) => total + numero, 0);
  }
  
  console.log(sumar(1, 2, 3, 4));
  
  /*

El parámetro rest se representa mediante tres puntos consecutivos (...) 
seguidos de un nombre de variable en la lista de parámetros de una función. 
Permite capturar múltiples argumentos pasados a una función en un solo arreglo.

  */