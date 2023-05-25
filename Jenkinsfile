node {
agent any

  stage('Which Java?') {
        sh 'java --version'
  }

  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/nkchauhan003/jenkins-demo.git'
  }

  stage("Wich mvn") {
    sh './mvnw -v'
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