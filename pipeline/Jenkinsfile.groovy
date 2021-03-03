library(
  identifier: 'jenkins-setimage@master',
  retriever: modernSCM([
  $class: 'GitSCMSource',
  remote: 'https://github.com/tennsk/test.git'
  ])
)

jobParams()

node {
  stage("test") {
    sh("echo 'Params: ${params.ENVIRONMENT}, Env: ${ENVIRONMENT}'")  
  }
}
