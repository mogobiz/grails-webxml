
description("Creates WebXmlConfig.groovy")

String destination = "$basedir/grails-app/conf/WebXmlConfig.groovy"
if (new File(destination).exists()) {
	println '\ngrails-app/conf/WebXmlConfig.groovy exists, not overwriting\n'
}
else{
	render  template:"samples/_WebXmlConfig.groovy", destination: file(destination)
	println '\nCreated grails-app/conf/WebXmlConfig.groovy\n'
}
