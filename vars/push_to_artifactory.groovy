def call(List... args){

    args.each {

        rtUpload(serverId: "Artifactory",

             spec: """{

                  "files":[{

                        "pattern": "${it[0]}",

                        "target": "${it[1]}"}]

            }"""

        )

    }

}
