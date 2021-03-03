def call() {
    properties([
        parameters([
            booleanParam(
                name: 'BuildAll',
                defaultValue: false,
                description: ''
            ),
            choice(
              name: 'ENVIRONMENT',
              choices: [
                'QA',
                'DEV',
                'PROD',
              ],
              description: 'Choose environment category.',
           )
        ])
    ])
}