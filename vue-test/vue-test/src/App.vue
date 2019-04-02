<template>
  <div id="app">
    <div>
      <router-view></router-view>
    </div>
    <!--<Login></Login>-->
    <!--<img src="./assets/logo.png">-->
    <!--<router-view/>-->
  </div>
</template>

<script>
    import Login from '@/components/Login'

    export default {
        name: 'App',
        components: {
            'Login': Login
        },
        data() {
            return {}
        }
    }
</script>

<style>
#app {
  /*font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;*/
  text-align: center;
  margin-top: 250px ;
}
</style>
