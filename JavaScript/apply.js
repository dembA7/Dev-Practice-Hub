function sumar(a, b) {
  return a + b + this.numero;
}

const objeto = {
  numero: 10
};

const resultado = sumar.apply(objeto, [5, 7]);
console.log(resultado);