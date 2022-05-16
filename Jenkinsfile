pipeline {
  agent any
  stages {
    stage('verify k6') {
      steps {
        & 'C:\Program Files\k6\k6.exe' version
      }
    }
    stage('run k6 test') {
      steps {
        & 'C:\Program Files\k6\k6.exe' run --vus 10 --duration 30s stress.js'
      }
    }
  }
}
