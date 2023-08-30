// Función original de aridad múltiple
function suma(a, b) {
  return a + b;
}

// Función curried
function curriedSuma(a) {
  return function(b) {
    return a + b;
  };
}

const resultado = curriedSuma(2);
console.log(resultado(17));
