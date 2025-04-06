# java-teste-lombok

# Visual Studio Code no Codespaces do GitHub
Instalar a extensão `Lombok Annotations Support for VS Code` para garantir que as `anotações` do `Lombok` sejam reconhecidas.

![Extensão "Lombok Annotations Support for VS Code" para garantir que as anotações do Lombok sejam reconhecidas.](extensaoLombokVSCode.png)

# Executar os comandos:
```
sdk list java
sdk install java 21.0.6-amzn
sdk default java 21.0.6-amzn
```

```
mvn clean install
```

```
java -jar target/lombok-project-1.0-SNAPSHOT.jar
```

```
git add .
git commit -m "Projeto com Lombok"
git push
```