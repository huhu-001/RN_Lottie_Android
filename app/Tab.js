import React, { PureComponent ,Component} from 'react'
import {
    StyleSheet,
    View,
    Text,
    TouchableOpacity,
    Image,Platform
} from 'react-native'
import ScrollableTabView from 'react-native-scrollable-tab-view'
import Main from './main'
import Order from './order'

export default class TabBarView extends PureComponent {

    constructor(props) {
        super(props)
        this.state = {
            isVisible: false
        }
    }

    componentDidMount() {
     
    }

    onChangeTab=()=>{

    }

    render() {
        return (
            <View style={{ flex: 1,backgroundColor:"#F6F6F7" }}>
                <ScrollableTabView
                    locked={true}
                    tabBarPosition='bottom'
                    onChangeTab={this.onChangeTab}>
                    <Main tabLabel="React" />
                    <Order tabLabel="Flow" />

                </ScrollableTabView>
            </View>
        )
    }
}