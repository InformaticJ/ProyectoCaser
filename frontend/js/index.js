$(document).ready(function () {

/* Iniciar sesión */
$("#login").submit(function(event){
    event.preventDefault(); // Previene que se envíe el formulario automáticamente
    window.location.href = "./html/inicio.html";
})
});

   
