def call(){
  timeout(time: 60, unit: "MINUTES"){
      waitForQualityGate abortPipeline: false
  }
}
