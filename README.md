# Environment Setup

1) Import the project on your IDE (IntelliJ is the suggested one)
2) Be sure that you have MySQL or PostgreSQL installed on your local machine with the expected configuration:
- Local PostgreSQL [[PC](https://www.postgresql.org/download/windows/) / [Mac](https://www.postgresql.org/download/macosx/)]
```
username=postgres
password=postgres
database=saovicente
port=5432
```
   
- Local MySQL [[PC](https://dev.mysql.com/doc/refman/8.0/en/windows-installation.html) / [Mac](https://dev.mysql.com/doc/refman/8.0/en/macos-installation.html)]
```
username=root
password=root
database=saovicente
port=3306/saovicente
```
To configure your local DB on the application, comment the block named `Server PostgreSQL` which is used to deploy the application on Heroku. And comment the block of code related to the DB of your choose.
> Obs.: If you have any issue with hibernate when running your application, take a look if it's not related to a missing database named saovicente. The url should create it if don't exists but it may not work properly.

3) Through maven, run clean and install commands. It can be done via maven IDE tool or command line:
    1) **[suggested]** On IntelliJ, on the top right of window, there is a tab with database and maven tools (if the project was imported correctly). Click maven, and it will open a bunch of maven options including clean and install.
    2) On the project root, run `mvnw clean install`

> Obs.: clean command will delete target directory if it exists and install will download maven dependencies, build the project and recreate target directory with built files and static resources. **Remember to rerun it whenever you change FE or BE code.**

4) Run the application:
   1) **[suggested]** Go to the application class and click play. It will create a run configuration on you IDE.
   2) On the project root, run `mvnw spring-boot:run` (to debug it, you'll need to create a run configuration on your IDE and attach it to your application)
5) Access `http://localhost:8080/home` on your browser (please, do not use IE)

# Deploy
The deploy happens through [Heroku](https://heroku.com) and can be accessed [here](https://fast-sierra-78701.herokuapp.com/). It is configured to automatically deploy the `main` branch when a PR is closed. Be sure you always create a PR for your changes.

> Don't ever commit the changes on application.properties related to Local DB configuration. It will break the deploy.
