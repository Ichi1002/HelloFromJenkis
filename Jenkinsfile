pipeline  {
  agent any
      tools {
          maven 'Maven 3.9.2'
      }
  stages{
    stage('Which Java and mvn?') {
         steps {
            sh 'java -version'

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
    stage("Runing unit tests") {
        steps {
            sh "mvn test -Punit"
        }
    }
    stage("Deployment") {
        steps {
            sh 'nohup mvn spring-boot:run -Dserver.port=8001 &'
        }
    }
    stage("TestAPi") {
        steps{
            sh 'pwd'
        }
    }


}
}