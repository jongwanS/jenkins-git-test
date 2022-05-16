pipeline {
  agent any
  stages {
    stage('verify k6') {
      steps {
        bat 'k6.exe version'
      }
    }
    stage('run k6 test') {
      steps {
        bat 'k6.exe run --vus 10 --duration 30s stress.js'
      }
    }
  }
}
