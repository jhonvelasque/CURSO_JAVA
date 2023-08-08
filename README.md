## Para subir tu código Java desde la carpeta "open-boopcamp" a GitHub, debes seguir estos pasos:

Crea un repositorio en GitHub:

1. Ve a tu cuenta de GitHub y haz clic en el botón "New" para crear un nuevo repositorio.
Dale un nombre al repositorio y configura otras opciones según tus preferencias. Puedes elegir si el repositorio será público o privado.
Configura Git en tu máquina local:

2. Abre una terminal en tu computadora.
Navega hasta la carpeta "open-boopcamp" que contiene tu código Java utilizando el comando cd (Change Directory).
Inicializa el repositorio Git:

3. Una vez en la carpeta correcta, ejecuta el siguiente comando para iniciar un repositorio Git local:

```bash
git init
```
Agrega y confirma tus archivos:todos los archivos de tu carpeta al área de preparación utilizando el comando:

```bash
git add .
```
Luego, crea un commit para estos cambios:
```bash
git commit -m "Primer commit"

```
Conecta tu repositorio local con el remoto:
URL del repositorio remoto que creaste en GitHub.

Ejecuta el siguiente comando para establecer la conexión entre tu repositorio local y el remoto:

```bash
git remote add origin <URL_DEL_REPOSITORIO>

```
Sube tu código al repositorio remoto:
despues, sube tus cambios al repositorio remoto en GitHub utilizando el comando:

```bash
git push origin master
```
Si estás utilizando una rama diferente en lugar de "master", asegúrate de reemplazarcon el nombre de tu rama.

Estos pasos te permitirán subir tu código Java desde la carpeta "open-boopcamp" a GitHub. No es necesario estar dentro de la carpeta en la terminal para hacer esto. Puedes ejecutar los comandos desde cualquier ubicación en la terminal y proporcionar la ruta correcta a la carpeta "open-boopcamp" en los comandos relevantes.



