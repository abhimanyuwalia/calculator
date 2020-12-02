pipeline {
     agent any
     stages {
	stage("Package") {
     		steps {
          		sh "./gradlew build"
     		}
	}
	stage("Docker build") {
     		steps {
          		sh "docker build -t localhost/calculator ."
     		}
	stage("Docker push") {
     		steps {
          		sh "docker push localhost/calculator"
     		}
	}
	stage("Deploy to staging") {
     		steps {
          		sh "docker run -d --rm -p 8765:8080 --name calculator leszko/calculator"
     		}
	}
	stage("Acceptance test") {
     		steps {
          		sleep 60
          		sh "chmod +x acceptance_test.sh && ./acceptance_test.sh"
	     	}
	}
     }
     post {
        always {
          	sh "docker stop calculator"
     	}
     }
}
