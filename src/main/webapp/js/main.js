class DraftTableHead extends React.Component {
    render() {
        return (
            <thead>
            <tr>
                <td>Pick</td>
                <td>Share</td>
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
                <td>{draft.share}</td>
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
        fetch('selections').then(function(response){
            return response.json();
        }).then(function(data) {
            _this.setState({selections: data.selections});
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
