function conteoPatas(patas, animales) {
  const pataConejo = 4;
  const pataGallina = 2;
  let conejos = (patas - animales * pataGallina) / 2;
  let gallinas = (animales * pataConejo - patas) / 2;
//typeof(patas) !== String
  patas % 2 === 0  ? alert(`Hay ${conejos} conejos y hay ${gallinas} gallinas`) : alert("Error de digitacion");
}

let patas = Number(prompt("Digite el total de patas"));
let animales = Number(prompt("Digite la cantidad de animales"));

conteoPatas(patas, animales)