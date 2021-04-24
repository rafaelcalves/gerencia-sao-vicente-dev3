# Environment Setup

1) Import the project on your IDE
2) Through maven, run clean and install commands. It can be done via maven IDE tool or command line:
    1) **[suggested]** On IntelliJ, on the top right of window, there is a tab with database and maven tools (if the project was imported correctly). Click maven, and it will open a bunch of maven options including clean and install.
    2) On the project root, run `mvnw clean install`

> Obs.: clean command will delete target directory if it exists and install will download maven dependencies, build the project and recreate target directory with built files and static resources. **Remember to rerun it whenever you change FE or BE code.**

3) Run the application:
   1) **[suggested]** Go to the application class and click play. It will create a run configuration on you IDE.
   2) On the project root, run `mvnw spring-boot:run` (to debug it, you'll need to create a run configuration on your IDE and attach it to your application)
4) Access `http://localhost:8080/home` on your browser (please, do not use IE)
