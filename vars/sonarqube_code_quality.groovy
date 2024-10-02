def call(){
  timeout(time: 3600, unit: "MINUTES"){
      waitForQualityGate abortPipeline: false
  }
}
