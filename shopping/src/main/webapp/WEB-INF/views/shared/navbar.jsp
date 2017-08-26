  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
        <a class="navbar-brand" href="${contextRoot}/home">Shopping Site</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto ">
                <li class="nav-item" id="about">
                    <a class="nav-link" href="${contextRoot}/about">About</a>
                </li>
                  <li class="nav-item" id="contact">
                    <a class="nav-link" href="${contextRoot}/contact">Contact</a>
                </li>
                <li class="nav-item active" id="listProducts">
                    <a class="nav-link" href="${contextRoot}/show/all/products">View Products</a>
                </li>
                 <li class="nav-item active" id="manageProducts">
                    <a class="nav-link" href="${contextRoot}/manage/products">ManageProducts</a>
                </li>
                 
               </ul>
               
                 <ul class="nav navbar-nav navbar-right">
                    
                     <li id="register">
                        <a href="${contextRoot}/register">Sign up</a>
                    </li>
                    
                    <li id="login">
                        <a href="${contextRoot}/login">Login</a>
                    </li>
               </ul>
        </div>
    </nav>
