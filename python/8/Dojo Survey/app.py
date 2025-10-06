from flask import Flask ,render_template ,redirect ,request ,session
app =Flask(__name__)


@app.route('/')
def index():
    return render_template("index.html")

@app.route("/submit",methods=['POST'])
def create_user():
        print("Got Post Info")
        session['name']=request.form['your_name']
        return redirect('/login')

@app.route('/login')
def show_user():
    return render_template('index.html', name_on_template=session['name'])

if __name__ == "__main__":
    app.run(debug=True)
