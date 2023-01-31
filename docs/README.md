# CDK8s & CDK8s+ website

The [cdk8s.io](https://cdk8s.io) website is a [static site](https://gohugo.io/about/benefits/) split into two parts:

- The landing page for [cdk8s.io](https://cdk8s.io) is built using [Hugo](https://gohugo.io/) in the [`cdk8s/website`](../website/) directory.
- The documentation pages that are served under [cdk8s.io/docs/*](https://cdk8s.io/docs) are built using [MkDocs](https://www.mkdocs.org/) in the [`cdk8s/docs`](.) directory (same location as the README.md file that you're currently reading).

## ⚠️ Prerequisites

- [Node.js](https://nodejs.org/en/download/) - Required to use Yarn.
- [Yarn v1](https://classic.yarnpkg.com/en/docs/install#mac-stable) - Used to install cdk8s-plus-* packages.
- [Python3](https://www.python.org/downloads/) - Used to install the dependencies for the documentation pages.
- [Hugo](https://gohugo.io/installation/) - Used to build the landing page and to bundle all the website files together for deployment.

## :rocket: Quick start

**1. Install the Node dependencies**

From the root of this repo (`cdk8s/`) run:

```bash
yarn install
```

This will…

- Install the latest release of the currently supported `cdk8s-plus-*` packages. We'll need this later to copy the doc files from each package into the [`cdk8s/docs/`](.) directory.

**2. Build the documentation pages**

From the root of this repo run the [build docs script](./build.sh):

```bash
./docs/build.sh
```

This will…

- Install the pip dependencies.
- Copy the doc files from each `cdk8s/node_modules/cdk8s-plus-*` package into [`cdk8s/docs/plus/`](./plus/).
- Copy the [`cdk8s/Roadmap.md`](../ROADMAP.md), [`cdk8s/CONTRIBUTING.md`](../CONTRIBUTING.md) and [`cdk8s/CHANGELOG.md`](../CHANGELOG.md) files into the [`cdk8s/docs/`](.) directory.
- Build the documentation pages using MkDocs and copy them to the [`cdk8s/website/public/docs/latest`](../website/public/docs/latest) directory.

**3. Run the MkDocs server to preview the documentation content of the site.**

```bash
mkdocs serve
```

This should start the server at [http://127.0.0.1:8000/](http://127.0.0.1:8000/)

**4. (Optional) Run the Hugo server to preview the landing page**

You'll need to have [Hugo](https://gohugo.io/getting-started/installing/) installed. Then in a new terminal run step into the `cdk8s/website` directory and run:

```bash
hugo server
```

This should start the server at [http://127.0.0.1:1313/](http://127.0.0.1:1313/)

> Changes made to the docs content in `cdk8s/docs/*` will not be reflected in the Hugo server. You'll need to re-run the [build docs script](./build.sh) to see the changes or use the MkDocs server from step 3.

## 📦 Building the production site

**1. Build the landing page.**

From the `cdk8s/website` directory run:

```bash
./build.sh
```

**2. Build the MkDocs pages and copy them to Hugo's public directory.**

From the root of this repo run the [build docs script](./build.sh):

```bash
./docs/build.sh
```

The site's static files should now be available in the `website/public` directory ready for deployment.

## :house: cdk8s.io landing page

The content of the [landing page](https://cdk8s.io/) is maintained in [`cdk8s/website/config.yaml`](../website/config.yaml). You'll see the various sections, and some commentary from the theme authors on where images are loaded from.

Sections can be removed by simply omitting their `section` key from `config.yaml`.

The actual code for the landing page is located in [`cdk8s/website/static/js/webflow.js`](../website/static/js/webflow.js). However it is not recommended to edit this file. It was generated using [Webflow](https://webflow.com/) and is difficult to read. It's source Webflow project is no longer available. _This is obviously not an ideal implementation. It stands as one of the major justifications that a revamp is due for this website._

## 📖 cdk8s.io/docs/* pages

The documentation content is located in the [`cdk8s/docs`](.) directory. This content is written in Markdown and is built using MkDocs. Here are a few pointers to help save you time.

## :heavy_plus_sign: Where do the cdk8s-plus-* docs come from?

The documentation for the `cdk8s-plus-*` packages are bundled with every NPM package published from the [cdk8s-plus](https://github.com/cdk8s-team/cdk8s-plus) repo. This way documentation can be version specific and easily maintained along side the source code.

Supported cdk8s-plus-* versions are installed in this repo via yarn (step 1 in the [:rocket: Quick start section](#🚀-quick-start)). The docs for each package are then copied from `cdk8s/node_modules/cdk8s-plus-*/docs/plus/` into the respective [`cdk8s/docs/plus/cdk8s-plus-*/`](./plus/) directory. This is done by the [build docs script](./build.sh) (step 2 in the [:rocket: Quick start section](#🚀-quick-start)).

If you'd like to modify the content of any cdk8s-plus-* docs, you'll need to do so in the respective [cdk8s-plus](https://github.com/cdk8s-team/cdk8s-plus) release branch.

> e.g. To update the cdk8s-plus-24 docs you'll need to commit changes to the [cdk8s-plus/k8s-24](https://github.com/cdk8s-team/cdk8s-plus/tree/k8s-24/main/docs/plus) branch.


### 📄 Adding, removing, reordering or renaming pages

A `.pages` file can be used in each directory to describe the page structure of the site. This is a feature provided by the [Awesome pages plugin](https://henrywhitaker3.github.io/mkdocs-material-dark-theme/plugins/awesome-pages/) check out their docs for more info.

To hide files, define a `.pages` file in the directory of that file and omit file from it's configuration.

> Notice how this README.md file that you're reading is located in the [`cdk8s/docs`](.) directory but it will not be included in the website build unless we add it to the [`cdk8s/docs/.pages`](./.pages) file.

### 🖼️ Assets and custom CSS

The [`cdk8s/docs/assets`](./assets/) directory is used to store assets that are used in the documentation. For example, images, diagrams, etc. The [`cdk8s/docs/assets/extra.css`](./assets/extra.css) is a file we've defined to apply custom CSS should you need it.

### 🔌 Where plugins, features, and global configuration are defined

The [`cdk8s/mkdocs.yaml`](../mkdocs.yml) file is used to define MkDocs configuration. This is where the logo, site name, favicon, theme colors, footer content are all defined. It is also where you can define extension such as supporting multi tab content blocks, table of content settings, and more. You'll also define plugins here such as the search plugin. Check out the [MkDocs config documentation](https://www.mkdocs.org/user-guide/configuration/) for more info.

### 👨‍💻 Development resources

- [MkDocs material theme setup](https://squidfunk.github.io/mkdocs-material/setup/changing-the-colors/) - This is the MkDocs theme we use and is also where you'll find APIs that allow you to customize the color theme, fonts, logo, and site search.
- [MkDocs material theme API](https://squidfunk.github.io/mkdocs-material/reference/) - Create Admonitions, Annotations, Buttons, Code blocks, Content tabs, Icons, Images, and more.
- [MkDocs site config docs](https://www.mkdocs.org/user-guide/configuration/) - Lists the global MkDocs configuration options that can be defined in `cdk8s/mkdocs.yaml`.
- [MkDocs plugin docs](https://www.mkdocs.org/dev-guide/plugins/) - Defines the plugin API that can be used to extend MkDocs.
- [Site search plugin docs](https://henrywhitaker3.github.io/mkdocs-material-dark-theme/plugins/search/) - This is the search plugin we use and is where you'll find APIs that allow you to customize the search experience.
- [Awesome pages plugin docs](https://henrywhitaker3.github.io/mkdocs-material-dark-theme/plugins/awesome-pages/) - Used to define the page structure of the site using `.pages` files.
