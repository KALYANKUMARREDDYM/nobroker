pipeline{
	agent{ docker 'maven:3.5alpine'}
		stages{
			stage('checkout'){
				steps{
					git 'https://github.com/KALYANKUMARREDDYM/nobroker.git'
				}
			
			}
			stage('Build'){
				steps{
					sh 'mvn clean package'
					junit '**/target/surefire-reports/TEST-*.xml'
				
				}
			}
		}

}