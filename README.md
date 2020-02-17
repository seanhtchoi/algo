# VSCode + Java + Maven + JUnit 5

- git clone https://github.com/seanhtchoi/java-starter.git
- code --install-extensions ryanluker.vscode-coverage-gutters
- mvn install
- mvn clean jacoco:preprare-agent install jacoco:report
- mvn test