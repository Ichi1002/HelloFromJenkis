node {
  agent any
      tools {
          maven 'Maven 3.9.2'
      }
  stage('Which Java?') {
                sh 'java -version'
  }

  stage('Which mvn?') {
                  sh 'mvn -version'
    }

  stage("Clone the project") {
    git branch: 'master', url: 'https://github.com/Ichi1002/HelloFromJenkis'
  }

  stage("Compilation") {
    sh "./mvnw clean install -DskipTests"
  }



  stage("Tests and Deployment") {
    stage("Runing unit tests") {
      sh "./mvnw test -Punit"
    }
    stage("Deployment") {
      sh 'nohup ./mvnw spring-boot:run -Dserver.port=8001 &'
    }
  }
}