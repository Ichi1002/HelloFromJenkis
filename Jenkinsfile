pipeline  {
  agent any
      tools {
          maven 'Maven 3.9.2'
      }
  stages{
    stage('Which Java and mvn?') {
         steps {
            sh ''''
                java -version
                mvn -version
                '''
         }
    }

    stage("Clone the project") {
        steps {
        git branch: 'master', url: 'https://github.com/Ichi1002/HelloFromJenkis'
        }
    }

    stage("Compilation") {
        steps {
        sh "mvn clean install -DskipTests"
        }
    }
  }



  stages("Tests and Deployment") {
    stage("Runing unit tests") {
        steps {
            sh "./mvnw test -Punit"
        }
    }
    stage("Deployment") {
        steps {
            sh 'nohup ./mvnw spring-boot:run -Dserver.port=8001 &'
        }
    }
  }
}
