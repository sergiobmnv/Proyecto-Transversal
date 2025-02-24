function cerrarModal(id) {
    document.getElementById(id).style.display = "none";
}

function openModal(modalId) {
    document.getElementById(modalId).style.display = "flex";
}

function closeModal(modalId) {
    document.getElementById(modalId).style.display = "none";
}

// Función para mostrar el modal
function mostrarModal(modalId) {
    var modal = document.getElementById(modalId);
    modal.classList.add('show');
}

// Función para ocultar el modal
function ocultarModal(modalId) {
    var modal = document.getElementById(modalId);
    modal.classList.remove('show');
}

function showErrorModal(mensaje) {
    let errorModal = document.getElementById("errorModal");
    let errorText = document.getElementById("error");

    errorText.innerText = mensaje; // Cambia el texto del modal con el mensaje recibido
    errorModal.style.display = "flex"; // Muestra el modal

    // Cierra el modal después de 3 segundos
    setTimeout(() => {
        errorModal.style.display = "none";
    }, 3000);
}

function showExitoModal(mensaje) {
    let exitoModal = document.getElementById("exitoModal");
    let exitoText = document.getElementById("exito");

    exitoText.innerText = mensaje; // Cambia el texto del modal con el mensaje recibido
    exitoModal.style.display = "flex"; // Muestra el modal

    // Cierra el modal después de 3 segundos
    setTimeout(() => {
        exitoModal.style.display = "none";
    }, 3000);
}

const btnRegistro = document.getElementById("registro");

document.getElementById("registroForm").addEventListener('submit', function(event) {
    event.preventDefault(); // Evitar el envío del formulario por defecto

    let valid = true; // Variable para controlar si todas las validaciones son correctas

    const password1 = document.getElementById("pwd").value;
    const password2 = document.getElementById("pwd2").value;

    // Validación de contraseñas
    if (password1 !== password2) {
        showErrorModal("Las contraseñas no coinciden.");
        valid = false;
    } else if (password1.length <= 10) {
        showErrorModal("La longitud de la contraseña debe ser mayor a 10.");
        valid = false;
    } else if (!/[A-Z]/.test(password1)) {
        showErrorModal("La contraseña debe tener mínimo una mayúscula.");
        valid = false;
    }

    // Validación de edad
    const fechaNacimiento = document.getElementById("fechaNacimiento").value;
    const edad = new Date(fechaNacimiento).getFullYear();
    const hoy = new Date().getFullYear();
    if ((hoy - edad) < 18) {
        showErrorModal("Queda prohibido el acceso a menores.");
        valid = false;
    }

    // Validación de DNI
    const dniRegex = /^[0-9]{8}[A-Za-z]$/;
    const dni = document.getElementById("dni").value;
    if (!dniRegex.test(dni)) {
        showErrorModal("El formato del DNI es incorrecto.");
        valid = false;
    }

    // Si todas las validaciones son correctas, proceder a enviar los datos
    if (valid) {
        const username = $("#username").val();
        const email = $("#email").val();
        const pwd = $("#pwd").val();
        const nombre = $("#nombre").val();
        const apellido = $("#apellido").val();
        const fechaNacimiento = $("#fechaNacimiento").val();

        // CREACIÓN JSON CON DATOS DEL REGISTRO
        const registroData = {
            username: username,
            pwd: pwd,
            email: email,
            nombre: nombre,
            apellido: apellido,
            dni: dni,
            fechaNacimiento: fechaNacimiento,
        };

        console.log(JSON.stringify(registroData));    
        $.ajax({
            type: "POST",
            url: "/usuario/registro",
            contentType: "application/json",
            data: JSON.stringify(registroData),
            success: function(response) {
                showExitoModal("USUARIO REGISTRADO CON ÉXITO.");
                closeModal("registerModal");
                console.log("Respuesta del servidor:", response);
            },
            error: function(error) {
                console.error("Error en la solicitud AJAX:", error);
            }
        });
    }
});

function submitGet() {
    const username = $("#usernameLogin").val();
    const pwd = $("#pwdLogin").val();
    $.ajax({
        type: "GET",
        url: `/usuario/${username}/${pwd}`,
        success: function(response) {
            if (response == "OK") {
                showExitoModal("Usuario encontrado.");
                window.location.href = "lobbyCasino.html";
            } else if (response == "404") {
                showErrorModal("Usuario no encontrado.");
            } else if (response == "PWDNF") {
                showErrorModal("Contraseña incorrecta.");
            }
        },
        error: function(error) {
            console.error("Error en la solicitud AJAX (GET):", error);
        }
    });
}