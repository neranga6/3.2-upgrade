package writers.tool.web

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?"{
            constraints {
                // apply constraints here
            }
        }

         //"/"(view:"/index")
        "/"(controller:"home")
        "500"(view:'/error')
        "404"(view:'/notFound')

        "/login/$action?"(controller: "login")
        "/logout/$action?"(controller: "logout")

    }
}
