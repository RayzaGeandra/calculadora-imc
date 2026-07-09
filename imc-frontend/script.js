const calcularImc = document.querySelector(".card-resultado");
const verificarImc = document.querySelector(".btn-verificar");

verificarImc.addEventListener("click", function() {
    const altura = document.querySelector("#input-altura").value;
    const peso = document.querySelector("#input-peso").value;
    console.log(altura, peso);

    fetch(`http://localhost:8080/api/imc?peso=${peso}&altura=${altura}`)
.then(function(resposta) {
    return resposta.json();
    })
    .then(function(dado) {
        calcularImc.textContent = `Resultado do IMC: ${dado.toFixed(2)}`
    })
}); 

