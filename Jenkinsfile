node {
  stage('Which Java?') {

                sh 'which java'
  }

  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/Ichi1002/HelloFromJenkis'
  }
stage("Which mvn") {
      sh "./mvnw -v"
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