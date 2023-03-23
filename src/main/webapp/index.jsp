<html>
    <head>
        <title>Bienvenida</title>
        <style>
            body
            {
                display: flex;
                justify-content: center;
                align-items: center;
                background: #f8f8f8;
            }
            button {
                border: none;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                cursor: pointer;
            }
            button:hover
            {
                transform: translateY(-20px);
                transition: 0.3s;
            }
            #servlet
            {
                background-color: #e7e7e7;
                color: black;
                box-shadow: 15px 5px 15px 0px rgba(89, 55, 55, 0.35);
            }

            #faces
            {
                background-color: #4CAF50;
                box-shadow: 15px 5px 15px 0px rgb(118, 199, 145);
            }

        </style>
    </head>
    <body>
        <button id="servlet" onclick="window.location.href='index.html'">Servlet</button>
        <button id="faces" onclick="window.location.href='faces/guess.xhtml'">Prime Faces</button>
    </body>
</html>
