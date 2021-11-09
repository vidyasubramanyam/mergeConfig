def propertiesFile1 = new ConfigSlurper().parse(new File('config1.properties').toURL())
def propertiesFile2 = new ConfigSlurper().parse(new File('config2.properties').toURL())

propertiesFile2 = propertiesFile2.merge(propertiesFile1)
