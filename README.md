# Guía de Instalación y Uso de Maven

## Instalación de Maven

### En macOS
1. **Instalar Homebrew** (si no lo tienes instalado):
   ```bash
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   ```
2. **Instalar Maven usando Homebrew**:
   ```bash
   brew install maven
   ```
3. **Verificar la instalación**:
   ```bash
   mvn -version
   ```

### En Windows
1. **Descargar Maven**:
   - Ve a la página oficial de Maven: [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)
   - Descarga el archivo binario ZIP.

2. **Extraer el archivo**:
   - Extrae el contenido del archivo ZIP en una carpeta, por ejemplo: `C:\Program Files\Apache\Maven`.

3. **Configurar las variables de entorno**:
   - Agrega la ruta `C:\Program Files\Apache\Maven\bin` a la variable de entorno `PATH`.
   - Crea una nueva variable de entorno llamada `MAVEN_HOME` y establece su valor como `C:\Program Files\Apache\Maven`.

4. **Verificar la instalación**:
   - Abre una terminal (CMD o PowerShell) y ejecuta:
     ```cmd
     mvn -version
     ```

## Comandos útiles de Maven

### Compilar el proyecto
```bash
mvn compile
```

### Ejecutar todos los tests
```bash
mvn test
```

### Ejecutar un test específico
```bash
mvn -Dtest=NombreClaseTest test
```
Por ejemplo, para ejecutar solo los tests de la clase `BibliotecaTest`:
```bash
mvn -Dtest=BibliotecaTest test
```

### Limpiar el proyecto
```bash
mvn clean
```
Esto elimina los archivos generados en el directorio `target/`.

### Construir el proyecto (generar el JAR)
```bash
mvn package
```
El archivo JAR se generará en el directorio `target/`.

### Verificar la versión de Maven
```bash
mvn -version
```

## Notas adicionales
- Asegúrate de tener Java instalado y configurado correctamente en tu sistema.
- Si encuentras problemas, verifica que las variables de entorno `JAVA_HOME` y `PATH` estén configuradas correctamente.
