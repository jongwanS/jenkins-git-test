pipeline {
  agent any
  stages {
    stage('verify k6') {
      steps {
        'k6 version'
      }
    }
    stage('run k6 test') {
      steps {
        'k6 run --vus 10 --duration 30s stress.js'
      }
    }
  }
}
