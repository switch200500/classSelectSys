// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'

import iView from 'iview'
import 'iview/dist/styles/iview.css' // 使用 CSS
import axios from 'axios'
import "@/style/common.css"; // 公共的css
import ElementUi from 'element-ui'
import '../node_modules/element-ui/lib/theme-chalk/index.css'

import VueRouter from 'vue-router'
import routers from './routers'

Vue.use(ElementUi);
Vue.prototype.$axios = axios;
Vue.use(iView);
Vue.config.productionTip = false;


Vue.use(VueRouter);

const router = new VueRouter({
    mode: 'history',
    routes: routers
});

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
