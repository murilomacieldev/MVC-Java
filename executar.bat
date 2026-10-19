@echo off
cd /d "%~dp0"
if not exist build mkdir build
javac -encoding UTF-8 -d build Main.java model\Produto.java view\ProdutoView.java controller\ProdutoController.java
if errorlevel 1 (
    echo.
    echo Nao foi possivel compilar. Confira se o JDK esta instalado.
    pause
    exit /b 1
)
java -cp build Main
pause
