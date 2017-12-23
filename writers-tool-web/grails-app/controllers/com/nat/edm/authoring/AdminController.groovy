package com.nationwide.edm.authoring

import org.springframework.security.access.annotation.Secured

@Secured(['ROLE_ADMIN'])
class AdminController {

    def index() {
        render(view: "admin")
    }
}

