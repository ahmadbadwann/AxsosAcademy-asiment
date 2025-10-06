from flask import Flask ,render_template
app =Flask(__name__)
"app"

@app.route('/')
def hello_world():
    return "hallo world"

@app.route('/first')
def first_pag():
    return render_template("first_pag.html")


@app.route('/first/<int:x>')
def inc_box(x):
    return render_template('scand_pag.html',x=x)

@app.route('/first/<int:x>/<color>')
def changcolor(x,color):
    return render_template('scand_pag.html',x=x,box_color=color)

if __name__=="__main__":
    app.run(debug=True)