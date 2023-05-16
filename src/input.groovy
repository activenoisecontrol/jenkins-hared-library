def hasPermissionsDeploy() {
  office365ConnectorSend(
    message: "Deploy ${params.release} to Production?",
    webhookUrl: 'https://kaseya.webhook.office.com/webhookb2/2a46477e-0890-4d00-abe1-f653561dcc67@a1cd3436-6062-4169-a1bd-79efdcfd8a5e/IncomingWebhook/ee7a42daa2c143428b48696d8cb9e96d/7c0ecd83-6910-4f44-b219-c740a2fc2b5a'
  )
  timeout(time: 30, unit: 'MINUTES') {
    input(
      message: 'Deploy to Production?',
      submitter: 'noisecontrol'
    )
  }
}
