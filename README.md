# Parcial - Dockerizar aplicación y subir en nube

Construir una aplicación sencilla en Spring Boot (que envíe un saludo e indique tu nombre y la calificación que esperarías sacar en esta práctica).

## Contenido
Este repositorio contiene un ejercicio sencillo que incluye:
## Pasos para el Despliegue de la App
1. **Generar el proyecto:** Usar Spring Initializr y añadir la dependencia `Spring Web`.
2. **Crear el controlador:** Implementar el `@RestController` con los endpoints necesarios.
3. **Control de versiones:** Subir el código fuente a un repositorio remoto en **GitHub**.
4. **Dockerización:** Crear el archivo `Dockerfile` en la raíz del proyecto.
5. **Distribución:** Construir la imagen y subirla a **Docker Hub**.

## Capturas del proceso

*Fig. 1. Configuración inicial del proyecto en Spring Initializr.*

<br>

<img width="1832" height="624" alt="Paso 2" src="https://github.com/user-attachments/assets/4e73d4df-36bc-4c49-8b8c-6a90a6c35c0d" />
  
*Fig. 2. Clase controller.*

<br>

<img width="694" height="200" alt="Paso 3" src="https://github.com/user-attachments/assets/e9a7021f-c5e5-4a82-a02f-6797208b7718" />
  
*Fig. 3. Dockerfile (uso de una versión ligera de Eclipse).*

<br>

<img width="640" height="146" alt="Paso 4" src="https://github.com/user-attachments/assets/4a626bee-d24f-4e7e-821a-6722d5529d88" />
  
*Fig. 4. Imagen creada en Docker.*

<br>

<img width="1382" height="125" alt="Paso 5" src="https://github.com/user-attachments/assets/161f258b-69c2-4d20-957c-35ef7330e321" />
  
*Fig. 5. Imagen subida a Docker Hub.*

<br>

<img width="1919" height="808" alt="Paso 6" src="https://github.com/user-attachments/assets/e3edb3b9-8203-4dd4-ad46-26a278f9a03a" />
  
*Fig. 6. Ejecución de la aplicación en contenedor Docker.*

