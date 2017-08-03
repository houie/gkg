class DraftTableHead extends React.Component {
    render() {
        return (
            <thead>
            <tr>
                <td>Pick</td>
                <td>Shareholder</td>
                <td>Game</td>
                <td>Opponent</td>
            </tr>
            </thead>
        );
    }
}

class DraftTableBody extends React.Component {

    constructor(props) {
        super(props);
        this.state = {data: []};
    }

    render() {
        const draftRows = this.props.data.map((draft, i) =>
            <tr key={'draft_'+i}>
                <td>{draft.pick}</td>
                <td>{draft.shareholder}</td>
                <td>{draft.gameId} {draft.pair}</td>
                <td>{draft.team.team}</td>
            </tr>
        );
        return <tbody>{draftRows}</tbody>;
    }
}

class DraftTable extends React.Component {

    constructor(props) {
        super(props);
        this.state = {selections: []};
    }

    componentWillMount() {
        var _this = this;
        /* native fetch function
        fetch('selections').then(function(response){
            return response.json();
        }).then(function(data) {
            _this.setState({selections: data.selections});
        });
        */

        axios.get('selections')
        .then(function (response) {
            _this.setState({selections: response.data});
        })
        .catch(function (error) {
        });
    }

    render() {
        var _this = this;
        return (
            <table className="table table-striped">
                <DraftTableHead/>
                <DraftTableBody data={_this.state.selections}/>
            </table>
        );
    }
}

ReactDOM.render(<DraftTable/>, document.getElementById('draft-table'));

class SelectionModal extends React.Component {
    render() {
        return (
            <form>
                <div className="modal-dialog" role="document">
                  <div className="modal-content">
                    <div className="modal-header">
                      <button type="button" className="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                      <h4 className="modal-title" id="selection-modal-label">Game Selection</h4>
                    </div>
                    <div className="modal-body">
                        <div className="form-group">
                          <label htmlFor="selection-game">Game Id</label>
                          <input type="text" className="form-control" id="selection-game" placeholder="Enter game id"/>
                        </div>
                    </div>
                    <div className="modal-footer">
                      <button type="button" className="btn btn-default" data-dismiss="modal">Close</button>
                      <button type="submit" className="btn btn-primary">Select</button>
                    </div>
                  </div>
                </div>
            </form>
        );
    }    
}

ReactDOM.render(<SelectionModal/>, document.getElementById('selection-modal'));

class SelectionButton extends React.Component {

    doSomething() {
        console.log('Selection clicked');
    }

    render() {
        return (
            <a href="#" className="btn btn-primary btn-primary" onClick={this.doSomething} data-toggle="modal" data-target="#selection-modal">
                <span className="glyphicon glyphicon-star"></span> Select
            </a>
        );
    }
}

ReactDOM.render(<SelectionButton/>, document.getElementById('selection-button'));
