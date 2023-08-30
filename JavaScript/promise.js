const miPromesa = new Promise((resolve, reject) => {
    // Realizar una tarea asincrónica
    if (tareaExitosa) {
      resolve(resultadoExitoso);
    } else {
      reject(error);
    }
  });
  